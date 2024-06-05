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

public val Icons.Bold.Trumpet: ImageVector
    get() {
        if (_trumpet != null) {
            return _trumpet!!
        }
        _trumpet = Builder(name = "Trumpet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 3.0f)
                verticalLineToRelative(0.789f)
                curveToRelative(-1.535f, 5.206f, -5.601f, 6.432f, -8.0f, 6.688f)
                verticalLineToRelative(-2.477f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.893f)
                curveToRelative(-0.564f, 0.863f, -0.893f, 1.894f, -0.893f, 3.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                curveToRelative(0.0f, -0.869f, -0.203f, -1.691f, -0.563f, -2.422f)
                curveToRelative(2.131f, 0.765f, 4.479f, 2.455f, 5.563f, 6.132f)
                verticalLineToRelative(0.789f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 19.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(18.122f, 12.0f)
                curveToRelative(1.014f, -0.55f, 1.997f, -1.272f, 2.878f, -2.206f)
                verticalLineToRelative(4.412f)
                curveToRelative(-0.881f, -0.933f, -1.864f, -1.656f, -2.878f, -2.206f)
                close()
            }
        }
        .build()
        return _trumpet!!
    }

private var _trumpet: ImageVector? = null
