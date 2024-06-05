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

public val Icons.Filled.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.12f, 10.12f)
                lineToRelative(-5.4f, 5.58f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.72f, 0.3f)
                reflectiveCurveToRelative(-0.5f, -0.09f, -0.7f, -0.28f)
                curveToRelative(-0.4f, -0.38f, -0.41f, -1.02f, -0.02f, -1.41f)
                lineToRelative(5.14f, -5.3f)
                lineTo(13.0f, 9.01f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(8.42f)
                lineTo(16.28f, 1.7f)
                curveToRelative(-0.38f, -0.4f, -0.38f, -1.03f, 0.02f, -1.41f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.38f, 1.41f, 0.02f)
                lineToRelative(5.41f, 5.59f)
                curveToRelative(1.16f, 1.16f, 1.16f, 3.06f, -0.01f, 4.23f)
                close()
                moveTo(14.91f, 17.15f)
                curveToRelative(-0.37f, -0.36f, -1.87f, -2.35f, -2.91f, -3.75f)
                curveToRelative(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 3.48f)
                reflectiveCurveToRelative(-0.98f, 2.78f, -2.4f, 3.06f)
                curveToRelative(-1.92f, 0.37f, -3.6f, -1.09f, -3.6f, -2.94f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.96f, 0.81f, -3.73f, 2.11f, -5.0f)
                horizontalLineToRelative(-3.11f)
                curveTo(2.24f, 7.0f, 0.0f, 9.24f, 0.0f, 12.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.78f, 0.0f, -1.53f, -0.3f, -2.09f, -0.85f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
