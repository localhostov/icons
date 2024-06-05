package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Skeleton: ImageVector
    get() {
        if (_skeleton != null) {
            return _skeleton!!
        }
        _skeleton = Builder(name = "Skeleton", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.693f, 17.449f)
                curveToRelative(-0.602f, -1.485f, -1.95f, -2.424f, -3.544f, -2.449f)
                horizontalLineToRelative(-3.649f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                lineTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.673f)
                curveToRelative(-1.569f, 0.025f, -2.918f, 0.964f, -3.52f, 2.449f)
                curveToRelative(-0.626f, 1.547f, -0.279f, 3.3f, 0.885f, 4.464f)
                lineToRelative(2.087f, 2.087f)
                horizontalLineToRelative(11.44f)
                lineToRelative(2.088f, -2.087f)
                curveToRelative(1.164f, -1.164f, 1.511f, -2.917f, 0.885f, -4.464f)
                close()
                moveTo(17.687f, 19.792f)
                lineToRelative(-1.208f, 1.208f)
                lineTo(7.522f, 21.0f)
                lineToRelative(-1.208f, -1.208f)
                curveToRelative(-0.377f, -0.377f, -0.364f, -0.876f, -0.226f, -1.217f)
                curveToRelative(0.085f, -0.212f, 0.302f, -0.567f, 0.763f, -0.575f)
                horizontalLineToRelative(0.149f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -0.345f, -0.044f, -0.68f, -0.127f, -1.0f)
                horizontalLineToRelative(2.253f)
                curveToRelative(-0.083f, 0.32f, -0.127f, 0.655f, -0.127f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.125f)
                curveToRelative(0.486f, 0.008f, 0.702f, 0.363f, 0.788f, 0.575f)
                curveToRelative(0.138f, 0.341f, 0.151f, 0.84f, -0.226f, 1.217f)
                close()
            }
        }
        .build()
        return _skeleton!!
    }

private var _skeleton: ImageVector? = null
