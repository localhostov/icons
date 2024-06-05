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

public val Icons.Bold.BinarySlash: ImageVector
    get() {
        if (_binarySlash != null) {
            return _binarySlash!!
        }
        _binarySlash = Builder(name = "BinarySlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.78f, 13.0f)
                horizontalLineToRelative(2.22f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.44f)
                lineToRelative(-1.88f, -1.84f)
                lineToRelative(2.66f, -2.72f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-2.66f, 2.72f)
                lineToRelative(1.88f, 1.84f)
                verticalLineToRelative(6.44f)
                close()
                moveTo(15.5f, 21.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.55f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.13f, 0.43f, -0.21f, 0.88f, -0.21f, 1.34f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(1.0f, 0.0f, 1.91f, -0.34f, 2.66f, -0.89f)
                lineToRelative(-2.19f, -2.19f)
                curveToRelative(-0.15f, 0.05f, -0.3f, 0.08f, -0.47f, 0.08f)
                close()
                moveTo(23.96f, 21.84f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.38f, 2.38f)
                curveToRelative(0.76f, -1.43f, 2.24f, -2.41f, 3.96f, -2.41f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.19f, -0.47f, 2.3f, -1.26f, 3.12f)
                lineToRelative(3.41f, 3.41f)
                curveToRelative(0.12f, 0.0f, 0.23f, -0.03f, 0.35f, -0.03f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(0.38f)
                lineToRelative(3.96f, 3.96f)
                close()
                moveTo(10.0f, 4.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.38f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.24f, -0.27f, 0.39f, -0.61f, 0.39f, -0.99f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _binarySlash!!
    }

private var _binarySlash: ImageVector? = null
