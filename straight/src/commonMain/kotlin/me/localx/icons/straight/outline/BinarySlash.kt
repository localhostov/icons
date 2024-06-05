package me.localx.icons.straight.outline

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

public val Icons.Outline.BinarySlash: ImageVector
    get() {
        if (_binarySlash != null) {
            return _binarySlash!!
        }
        _binarySlash = Builder(name = "BinarySlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.42f, 5.0f)
                lineToRelative(-1.43f, -1.39f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.51f)
                lineTo(19.01f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.01f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                close()
                moveTo(7.49f, 13.0f)
                lineToRelative(-3.51f, 3.6f)
                lineToRelative(1.43f, 1.39f)
                lineToRelative(1.58f, -1.63f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(2.0f)
                lineTo(8.99f, 13.0f)
                horizontalLineToRelative(-1.51f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.52f, -1.61f, 2.01f, -2.79f, 3.79f, -2.79f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.96f, -0.37f, 1.88f, -0.99f, 2.6f)
                lineToRelative(3.64f, 3.64f)
                curveToRelative(0.43f, -0.15f, 0.88f, -0.24f, 1.35f, -0.24f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(1.59f)
                lineToRelative(3.96f, 3.96f)
                close()
                moveTo(6.0f, 4.59f)
                lineToRelative(3.6f, 3.6f)
                curveToRelative(0.25f, -0.34f, 0.4f, -0.76f, 0.4f, -1.19f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(0.59f)
                close()
                moveTo(16.0f, 22.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-1.76f)
                lineToRelative(-1.93f, -1.93f)
                curveToRelative(-0.04f, 0.23f, -0.07f, 0.45f, -0.07f, 0.68f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(1.04f, 0.0f, 1.98f, -0.41f, 2.69f, -1.06f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.35f, 0.29f, -0.79f, 0.48f, -1.28f, 0.48f)
                close()
            }
        }
        .build()
        return _binarySlash!!
    }

private var _binarySlash: ImageVector? = null
