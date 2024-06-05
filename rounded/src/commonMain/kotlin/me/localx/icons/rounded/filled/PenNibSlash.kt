package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.PenNibSlash: ImageVector
    get() {
        if (_penNibSlash != null) {
            return _penNibSlash!!
        }
        _penNibSlash = Builder(name = "PenNibSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.59f)
                lineTo(15.29f, 0.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(7.0f, 7.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineTo(13.0f, 2.59f)
                close()
                moveTo(18.71f, 17.3f)
                lineToRelative(1.68f, -4.49f)
                lineTo(11.19f, 3.61f)
                lineToRelative(-4.49f, 1.68f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(10.98f, 15.23f)
                lineToRelative(5.04f, 5.04f)
                lineToRelative(-12.14f, 3.68f)
                curveToRelative(-0.9f, 0.27f, -1.57f, -0.84f, -0.9f, -1.5f)
                lineToRelative(5.51f, -5.51f)
                curveToRelative(0.16f, 0.04f, 0.33f, 0.07f, 0.51f, 0.07f)
                curveToRelative(1.03f, 0.0f, 1.87f, -0.78f, 1.98f, -1.78f)
                close()
                moveTo(1.56f, 21.03f)
                curveToRelative(-0.67f, 0.67f, -1.78f, 0.0f, -1.5f, -0.9f)
                lineTo(3.74f, 7.99f)
                lineToRelative(5.04f, 5.04f)
                curveToRelative(-1.0f, 0.11f, -1.78f, 0.95f, -1.78f, 1.98f)
                curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.07f, 0.51f)
                lineTo(1.56f, 21.03f)
                close()
            }
        }
        .build()
        return _penNibSlash!!
    }

private var _penNibSlash: ImageVector? = null
