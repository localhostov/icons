package me.localx.icons.straight.filled

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

public val Icons.Filled.StageConcert: ImageVector
    get() {
        if (_stageConcert != null) {
            return _stageConcert!!
        }
        _stageConcert = Builder(name = "StageConcert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.61f, 22.0f)
                lineToRelative(0.805f, 2.0f)
                lineTo(5.584f, 24.0f)
                lineToRelative(0.805f, -2.0f)
                horizontalLineToRelative(11.221f)
                close()
                moveTo(24.0f, 7.349f)
                verticalLineToRelative(16.651f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(-0.805f, -2.0f)
                horizontalLineToRelative(2.305f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-4.5f)
                lineToRelative(2.125f, -1.699f)
                lineToRelative(-1.249f, -1.562f)
                lineToRelative(-2.875f, 2.301f)
                verticalLineToRelative(5.461f)
                lineTo(2.0f, 20.001f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.305f)
                lineToRelative(-0.805f, 2.0f)
                lineTo(0.0f, 24.001f)
                lineTo(0.0f, 7.349f)
                curveToRelative(0.0f, -1.186f, 0.691f, -2.282f, 1.761f, -2.793f)
                lineTo(10.666f, 0.302f)
                curveToRelative(0.849f, -0.404f, 1.821f, -0.404f, 2.668f, 0.0f)
                lineToRelative(8.905f, 4.254f)
                curveToRelative(1.07f, 0.511f, 1.761f, 1.606f, 1.761f, 2.793f)
                close()
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(-0.651f)
                curveToRelative(0.0f, -0.413f, -0.25f, -0.811f, -0.623f, -0.988f)
                lineToRelative(-0.714f, -0.341f)
                lineTo(3.337f, 6.02f)
                lineToRelative(-0.714f, 0.341f)
                curveToRelative(-0.373f, 0.178f, -0.623f, 0.575f, -0.623f, 0.988f)
                verticalLineToRelative(0.651f)
                lineToRelative(3.0f, 0.02f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, -0.02f)
                close()
            }
        }
        .build()
        return _stageConcert!!
    }

private var _stageConcert: ImageVector? = null
