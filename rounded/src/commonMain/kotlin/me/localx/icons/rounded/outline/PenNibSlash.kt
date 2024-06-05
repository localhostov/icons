package me.localx.icons.rounded.outline

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

public val Icons.Outline.PenNibSlash: ImageVector
    get() {
        if (_penNibSlash != null) {
            return _penNibSlash!!
        }
        _penNibSlash = Builder(name = "PenNibSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.71f, 17.29f)
                lineToRelative(2.15f, -5.74f)
                lineToRelative(2.85f, -2.85f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-5.59f, -5.59f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-2.85f, 2.85f)
                lineToRelative(-5.74f, 2.15f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(12.75f, 5.16f)
                lineToRelative(6.09f, 6.09f)
                lineToRelative(-1.68f, 4.49f)
                lineTo(8.26f, 6.85f)
                lineToRelative(4.49f, -1.68f)
                close()
                moveTo(14.96f, 19.58f)
                curveToRelative(0.15f, 0.53f, -0.16f, 1.08f, -0.69f, 1.24f)
                lineToRelative(-10.83f, 3.08f)
                curveToRelative(-0.25f, 0.07f, -0.5f, 0.11f, -0.75f, 0.11f)
                curveToRelative(-0.7f, 0.0f, -1.39f, -0.28f, -1.9f, -0.79f)
                curveToRelative(-0.7f, -0.7f, -0.96f, -1.72f, -0.68f, -2.66f)
                lineTo(3.19f, 9.73f)
                curveToRelative(0.15f, -0.53f, 0.7f, -0.84f, 1.24f, -0.69f)
                curveToRelative(0.53f, 0.15f, 0.84f, 0.7f, 0.69f, 1.24f)
                lineToRelative(-2.86f, 10.06f)
                lineToRelative(4.84f, -4.84f)
                reflectiveCurveToRelative(-0.03f, -0.09f, -0.04f, -0.14f)
                curveToRelative(-0.18f, -0.84f, 0.14f, -1.62f, 0.72f, -2.09f)
                curveToRelative(0.5f, -0.41f, 1.25f, -0.33f, 1.7f, 0.13f)
                lineToRelative(1.13f, 1.13f)
                curveToRelative(0.46f, 0.46f, 0.54f, 1.2f, 0.13f, 1.7f)
                curveToRelative(-0.47f, 0.58f, -1.25f, 0.9f, -2.09f, 0.72f)
                curveToRelative(-0.05f, -0.01f, -0.09f, -0.02f, -0.14f, -0.04f)
                lineToRelative(-4.84f, 4.84f)
                lineToRelative(10.06f, -2.86f)
                curveToRelative(0.53f, -0.15f, 1.08f, 0.16f, 1.24f, 0.69f)
                close()
            }
        }
        .build()
        return _penNibSlash!!
    }

private var _penNibSlash: ImageVector? = null
