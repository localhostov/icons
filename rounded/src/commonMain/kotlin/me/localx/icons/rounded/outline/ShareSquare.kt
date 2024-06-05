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

public val Icons.Outline.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 19.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveTo(2.24f, 24.0f, 0.0f, 21.76f, 0.0f, 19.0f)
                verticalLineToRelative(-7.0f)
                curveTo(0.0f, 9.24f, 2.24f, 7.0f, 5.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(23.13f, 5.89f)
                lineTo(17.72f, 0.3f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                reflectiveCurveToRelative(-0.41f, 1.02f, -0.02f, 1.41f)
                lineToRelative(5.14f, 5.3f)
                lineTo(13.0f, 6.99f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.42f)
                lineToRelative(-5.14f, 5.3f)
                curveToRelative(-0.38f, 0.4f, -0.38f, 1.03f, 0.02f, 1.41f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.28f, 0.7f, 0.28f)
                reflectiveCurveToRelative(0.52f, -0.1f, 0.72f, -0.3f)
                lineToRelative(5.4f, -5.57f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.01f, -4.23f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
