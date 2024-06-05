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

public val Icons.Bold.UpLeft: ImageVector
    get() {
        if (_upLeft != null) {
            return _upLeft!!
        }
        _upLeft = Builder(name = "UpLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.28f, 23.0f)
                curveToRelative(-0.9f, 0.0f, -1.79f, -0.34f, -2.47f, -1.02f)
                lineToRelative(-7.02f, -7.02f)
                lineToRelative(-1.06f, 1.06f)
                curveToRelative(-0.97f, 0.96f, -2.41f, 1.24f, -3.66f, 0.72f)
                curveToRelative(-1.25f, -0.52f, -2.06f, -1.74f, -2.06f, -3.1f)
                verticalLineTo(5.28f)
                curveToRelative(0.0f, -2.36f, 1.92f, -4.28f, 4.28f, -4.28f)
                horizontalLineTo(13.64f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(1.36f, 0.0f, 2.58f, 0.81f, 3.1f, 2.06f)
                curveToRelative(0.52f, 1.25f, 0.24f, 2.69f, -0.72f, 3.65f)
                lineToRelative(-1.17f, 1.17f)
                lineToRelative(7.02f, 7.02f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.47f)
                reflectiveCurveToRelative(-0.36f, 1.82f, -1.02f, 2.47f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.68f, 0.68f, -1.58f, 1.02f, -2.48f, 1.02f)
                close()
                moveTo(7.78f, 11.33f)
                curveToRelative(0.4f, 0.0f, 0.78f, 0.16f, 1.06f, 0.44f)
                lineToRelative(8.08f, 8.08f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.13f, -0.13f, 0.14f, -0.28f, 0.14f, -0.35f)
                reflectiveCurveToRelative(-0.02f, -0.23f, -0.14f, -0.35f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(11.67f, 8.94f, 11.67f, 8.94f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineToRelative(2.23f, -2.22f)
                curveToRelative(0.11f, -0.11f, 0.13f, -0.24f, 0.07f, -0.38f)
                curveToRelative(-0.06f, -0.15f, -0.17f, -0.22f, -0.33f, -0.22f)
                horizontalLineTo(5.28f)
                curveToRelative(-0.71f, 0.0f, -1.28f, 0.58f, -1.28f, 1.28f)
                verticalLineTo(13.64f)
                curveToRelative(0.0f, 0.16f, 0.07f, 0.27f, 0.22f, 0.33f)
                curveToRelative(0.15f, 0.06f, 0.28f, 0.04f, 0.39f, -0.08f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
                close()
            }
        }
        .build()
        return _upLeft!!
    }

private var _upLeft: ImageVector? = null
