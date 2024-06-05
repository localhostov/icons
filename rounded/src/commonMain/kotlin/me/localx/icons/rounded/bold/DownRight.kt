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

public val Icons.Bold.DownRight: ImageVector
    get() {
        if (_downRight != null) {
            return _downRight!!
        }
        _downRight = Builder(name = "DownRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.36f, 23.0f)
                curveToRelative(-1.36f, 0.0f, -2.58f, -0.81f, -3.1f, -2.07f)
                curveToRelative(-0.52f, -1.25f, -0.24f, -2.69f, 0.72f, -3.65f)
                lineToRelative(1.17f, -1.17f)
                lineTo(2.12f, 9.09f)
                curveToRelative(-1.36f, -1.36f, -1.36f, -3.58f, 0.0f, -4.95f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(1.37f, -1.36f, 3.59f, -1.36f, 4.95f, 0.0f)
                lineToRelative(7.02f, 7.02f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.97f, -0.96f, 2.4f, -1.24f, 3.66f, -0.72f)
                curveToRelative(1.25f, 0.52f, 2.06f, 1.74f, 2.06f, 3.1f)
                verticalLineToRelative(8.35f)
                curveToRelative(0.0f, 2.36f, -1.92f, 4.28f, -4.28f, 4.28f)
                horizontalLineTo(10.36f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(6.72f, 3.99f)
                curveToRelative(-0.13f, 0.0f, -0.26f, 0.05f, -0.35f, 0.15f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.12f, 0.12f, -0.14f, 0.28f, -0.14f, 0.35f)
                reflectiveCurveToRelative(0.02f, 0.23f, 0.14f, 0.35f)
                lineTo(12.33f, 15.05f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(-2.22f, 2.22f)
                curveToRelative(-0.11f, 0.11f, -0.13f, 0.24f, -0.07f, 0.38f)
                curveToRelative(0.06f, 0.15f, 0.17f, 0.22f, 0.33f, 0.22f)
                horizontalLineToRelative(8.35f)
                curveToRelative(0.71f, 0.0f, 1.28f, -0.58f, 1.28f, -1.29f)
                verticalLineTo(10.36f)
                curveToRelative(0.0f, -0.16f, -0.07f, -0.27f, -0.22f, -0.33f)
                curveToRelative(-0.15f, -0.06f, -0.27f, -0.03f, -0.39f, 0.08f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0.0f)
                lineTo(7.08f, 4.14f)
                curveToRelative(-0.1f, -0.1f, -0.23f, -0.15f, -0.35f, -0.15f)
                close()
            }
        }
        .build()
        return _downRight!!
    }

private var _downRight: ImageVector? = null
