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

public val Icons.Filled.ObjectIntersect: ImageVector
    get() {
        if (_objectIntersect != null) {
            return _objectIntersect!!
        }
        _objectIntersect = Builder(name = "ObjectIntersect", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(10.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(1.0f, 10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(0.84f, 3.94f)
                curveToRelative(0.11f, 0.04f, 0.22f, 0.06f, 0.33f, 0.06f)
                curveToRelative(0.41f, 0.0f, 0.8f, -0.26f, 0.94f, -0.67f)
                curveToRelative(0.2f, -0.56f, 0.66f, -1.02f, 1.22f, -1.22f)
                curveToRelative(0.52f, -0.18f, 0.79f, -0.75f, 0.61f, -1.28f)
                curveTo(3.76f, 0.32f, 3.19f, 0.05f, 2.67f, 0.23f)
                curveTo(1.52f, 0.63f, 0.63f, 1.52f, 0.23f, 2.67f)
                curveToRelative(-0.18f, 0.52f, 0.09f, 1.09f, 0.61f, 1.28f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(23.0f, 14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(23.16f, 20.06f)
                curveToRelative(-0.52f, -0.18f, -1.09f, 0.09f, -1.28f, 0.61f)
                curveToRelative(-0.2f, 0.56f, -0.65f, 1.02f, -1.22f, 1.22f)
                curveToRelative(-0.52f, 0.18f, -0.79f, 0.75f, -0.61f, 1.28f)
                curveToRelative(0.15f, 0.41f, 0.53f, 0.67f, 0.94f, 0.67f)
                curveToRelative(0.11f, 0.0f, 0.22f, -0.02f, 0.33f, -0.06f)
                curveToRelative(1.15f, -0.4f, 2.04f, -1.29f, 2.44f, -2.44f)
                curveToRelative(0.18f, -0.52f, -0.09f, -1.09f, -0.61f, -1.28f)
                close()
                moveTo(21.88f, 11.34f)
                curveToRelative(0.14f, 0.41f, 0.53f, 0.67f, 0.94f, 0.67f)
                curveToRelative(0.11f, 0.0f, 0.22f, -0.02f, 0.33f, -0.06f)
                curveToRelative(0.52f, -0.18f, 0.79f, -0.75f, 0.61f, -1.28f)
                curveToRelative(-0.56f, -1.6f, -2.08f, -2.67f, -3.77f, -2.67f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.85f, 0.0f, 1.6f, 0.54f, 1.89f, 1.33f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.85f, 0.0f, -1.6f, -0.54f, -1.89f, -1.33f)
                curveToRelative(-0.18f, -0.52f, -0.76f, -0.79f, -1.28f, -0.61f)
                curveToRelative(-0.52f, 0.18f, -0.79f, 0.76f, -0.61f, 1.28f)
                curveToRelative(0.56f, 1.6f, 2.08f, 2.67f, 3.77f, 2.67f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.33f, 21.89f)
                curveToRelative(-0.8f, -0.28f, -1.33f, -1.04f, -1.33f, -1.89f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.69f, 1.07f, 3.21f, 2.67f, 3.77f)
                curveToRelative(0.11f, 0.04f, 0.22f, 0.06f, 0.33f, 0.06f)
                curveToRelative(0.41f, 0.0f, 0.8f, -0.26f, 0.94f, -0.67f)
                curveToRelative(0.18f, -0.52f, -0.09f, -1.09f, -0.61f, -1.28f)
                close()
                moveTo(12.67f, 2.11f)
                curveToRelative(0.8f, 0.28f, 1.33f, 1.04f, 1.33f, 1.89f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.69f, -1.07f, -3.21f, -2.67f, -3.77f)
                curveToRelative(-0.52f, -0.18f, -1.09f, 0.09f, -1.28f, 0.61f)
                curveToRelative(-0.18f, 0.52f, 0.09f, 1.09f, 0.61f, 1.28f)
                close()
            }
        }
        .build()
        return _objectIntersect!!
    }

private var _objectIntersect: ImageVector? = null
