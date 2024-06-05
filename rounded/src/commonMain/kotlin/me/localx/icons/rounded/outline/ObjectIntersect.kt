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

public val Icons.Outline.ObjectIntersect: ImageVector
    get() {
        if (_objectIntersect != null) {
            return _objectIntersect!!
        }
        _objectIntersect = Builder(name = "ObjectIntersect", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(0.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(0.23f, 2.67f)
                curveTo(0.63f, 1.52f, 1.52f, 0.63f, 2.67f, 0.23f)
                curveToRelative(0.52f, -0.18f, 1.09f, 0.09f, 1.28f, 0.61f)
                curveToRelative(0.18f, 0.52f, -0.09f, 1.09f, -0.61f, 1.28f)
                curveToRelative(-0.56f, 0.2f, -1.02f, 0.65f, -1.22f, 1.22f)
                curveToRelative(-0.15f, 0.41f, -0.53f, 0.67f, -0.94f, 0.67f)
                curveToRelative(-0.11f, 0.0f, -0.22f, -0.02f, -0.33f, -0.06f)
                curveTo(0.32f, 3.76f, 0.04f, 3.19f, 0.23f, 2.67f)
                close()
                moveTo(18.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(23.77f, 21.33f)
                curveToRelative(-0.4f, 1.15f, -1.29f, 2.04f, -2.44f, 2.44f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.33f, 0.06f)
                curveToRelative(-0.41f, 0.0f, -0.8f, -0.26f, -0.94f, -0.67f)
                curveToRelative(-0.18f, -0.52f, 0.09f, -1.09f, 0.61f, -1.28f)
                curveToRelative(0.56f, -0.2f, 1.02f, -0.65f, 1.22f, -1.22f)
                curveToRelative(0.18f, -0.52f, 0.75f, -0.79f, 1.28f, -0.61f)
                curveToRelative(0.52f, 0.18f, 0.79f, 0.75f, 0.61f, 1.28f)
                close()
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.69f, 0.0f, 3.21f, 1.07f, 3.77f, 2.67f)
                curveToRelative(0.18f, 0.52f, -0.09f, 1.09f, -0.61f, 1.28f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.33f, 0.06f)
                curveToRelative(-0.41f, 0.0f, -0.8f, -0.26f, -0.94f, -0.67f)
                curveToRelative(-0.28f, -0.8f, -1.04f, -1.33f, -1.89f, -1.33f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.69f, 0.0f, -3.21f, -1.07f, -3.77f, -2.67f)
                curveToRelative(-0.18f, -0.52f, 0.09f, -1.09f, 0.61f, -1.28f)
                curveToRelative(0.52f, -0.18f, 1.09f, 0.09f, 1.28f, 0.61f)
                curveToRelative(0.28f, 0.8f, 1.04f, 1.33f, 1.89f, 1.33f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(11.94f, 23.16f)
                curveToRelative(-0.15f, 0.41f, -0.53f, 0.67f, -0.94f, 0.67f)
                curveToRelative(-0.11f, 0.0f, -0.22f, -0.02f, -0.33f, -0.06f)
                curveToRelative(-1.59f, -0.56f, -2.67f, -2.08f, -2.67f, -3.77f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.85f, 0.54f, 1.6f, 1.33f, 1.89f)
                curveToRelative(0.52f, 0.18f, 0.79f, 0.75f, 0.61f, 1.28f)
                close()
                moveTo(12.05f, 0.84f)
                curveToRelative(0.18f, -0.52f, 0.76f, -0.79f, 1.28f, -0.61f)
                curveToRelative(1.6f, 0.56f, 2.67f, 2.08f, 2.67f, 3.77f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.85f, -0.54f, -1.6f, -1.33f, -1.89f)
                curveToRelative(-0.52f, -0.18f, -0.79f, -0.75f, -0.61f, -1.28f)
                close()
            }
        }
        .build()
        return _objectIntersect!!
    }

private var _objectIntersect: ImageVector? = null
