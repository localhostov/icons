package me.localx.icons.rounded.bold

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

public val Icons.Bold.PenNibSlash: ImageVector
    get() {
        if (_penNibSlash != null) {
            return _penNibSlash!!
        }
        _penNibSlash = Builder(name = "PenNibSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.29f, 17.17f)
                lineToRelative(2.0f, -5.34f)
                lineToRelative(2.27f, -2.27f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(-4.88f, -4.88f)
                lineToRelative(1.44f, -1.44f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineToRelative(-2.27f, 2.27f)
                lineToRelative(-5.34f, 2.0f)
                lineTo(2.56f, 0.44f)
                curveTo(1.97f, -0.15f, 1.03f, -0.15f, 0.44f, 0.44f)
                curveTo(-0.15f, 1.02f, -0.15f, 1.98f, 0.44f, 2.56f)
                lineTo(21.44f, 23.56f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                lineToRelative(-4.27f, -4.27f)
                close()
                moveTo(12.62f, 5.74f)
                lineToRelative(5.63f, 5.63f)
                lineToRelative(-1.3f, 3.46f)
                lineToRelative(-7.8f, -7.8f)
                lineToRelative(3.46f, -1.3f)
                close()
                moveTo(14.44f, 19.35f)
                curveToRelative(0.23f, 0.8f, -0.24f, 1.63f, -1.03f, 1.85f)
                lineToRelative(-9.4f, 2.67f)
                curveToRelative(-0.29f, 0.08f, -0.58f, 0.12f, -0.87f, 0.12f)
                curveToRelative(-0.82f, 0.0f, -1.62f, -0.32f, -2.21f, -0.92f)
                curveToRelative(-0.81f, -0.81f, -1.12f, -2.0f, -0.79f, -3.1f)
                lineTo(2.8f, 10.59f)
                curveToRelative(0.23f, -0.8f, 1.05f, -1.26f, 1.85f, -1.03f)
                curveToRelative(0.8f, 0.23f, 1.26f, 1.06f, 1.03f, 1.85f)
                lineToRelative(-1.9f, 6.68f)
                lineToRelative(2.22f, -2.22f)
                curveToRelative(0.0f, -0.65f, 0.3f, -1.23f, 0.77f, -1.61f)
                curveToRelative(0.5f, -0.41f, 1.25f, -0.33f, 1.7f, 0.13f)
                lineToRelative(1.13f, 1.13f)
                curveToRelative(0.46f, 0.46f, 0.54f, 1.2f, 0.13f, 1.7f)
                curveToRelative(-0.38f, 0.47f, -0.96f, 0.77f, -1.61f, 0.77f)
                lineToRelative(-2.22f, 2.22f)
                lineToRelative(6.69f, -1.9f)
                curveToRelative(0.79f, -0.23f, 1.63f, 0.24f, 1.85f, 1.03f)
                close()
            }
        }
        .build()
        return _penNibSlash!!
    }

private var _penNibSlash: ImageVector? = null
