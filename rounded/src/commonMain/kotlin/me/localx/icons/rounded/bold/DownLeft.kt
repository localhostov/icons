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

public val Icons.Bold.DownLeft: ImageVector
    get() {
        if (_downLeft != null) {
            return _downLeft!!
        }
        _downLeft = Builder(name = "DownLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.74f, 23.0f)
                horizontalLineTo(5.39f)
                curveToRelative(-2.36f, 0.0f, -4.28f, -1.92f, -4.28f, -4.28f)
                verticalLineTo(10.36f)
                curveToRelative(0.0f, -1.36f, 0.81f, -2.57f, 2.06f, -3.1f)
                curveToRelative(1.25f, -0.52f, 2.69f, -0.24f, 3.65f, 0.71f)
                lineToRelative(1.07f, 1.07f)
                lineTo(14.91f, 2.02f)
                curveToRelative(1.36f, -1.37f, 3.58f, -1.37f, 4.95f, 0.0f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.47f)
                reflectiveCurveToRelative(-0.36f, 1.82f, -1.02f, 2.47f)
                lineToRelative(-7.02f, 7.02f)
                lineToRelative(1.16f, 1.16f)
                curveToRelative(0.96f, 0.97f, 1.24f, 2.4f, 0.72f, 3.66f)
                curveToRelative(-0.52f, 1.25f, -1.74f, 2.06f, -3.1f, 2.06f)
                close()
                moveTo(4.47f, 10.0f)
                reflectiveCurveToRelative(-0.1f, 0.01f, -0.15f, 0.03f)
                curveToRelative(-0.15f, 0.06f, -0.22f, 0.17f, -0.22f, 0.33f)
                verticalLineToRelative(8.36f)
                curveToRelative(0.0f, 0.71f, 0.58f, 1.28f, 1.29f, 1.28f)
                horizontalLineTo(13.74f)
                curveToRelative(0.16f, 0.0f, 0.27f, -0.07f, 0.33f, -0.21f)
                curveToRelative(0.06f, -0.14f, 0.04f, -0.27f, -0.08f, -0.39f)
                lineToRelative(-2.22f, -2.22f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                lineTo(19.86f, 6.97f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.12f, -0.12f, 0.14f, -0.27f, 0.14f, -0.35f)
                reflectiveCurveToRelative(-0.02f, -0.23f, -0.14f, -0.35f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f)
                lineTo(8.95f, 12.22f)
                curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0.0f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-0.07f, -0.07f, -0.15f, -0.1f, -0.23f, -0.1f)
                close()
            }
        }
        .build()
        return _downLeft!!
    }

private var _downLeft: ImageVector? = null
