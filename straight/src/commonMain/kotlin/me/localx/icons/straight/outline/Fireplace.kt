package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 15.008f)
                curveToRelative(-1.214f, 1.402f, -0.188f, 3.991f, -2.0f, 3.991f)
                curveToRelative(-0.855f, 0.0f, -0.67f, -1.725f, -0.67f, -1.725f)
                curveToRelative(-0.664f, 0.685f, -1.33f, 1.574f, -1.33f, 2.725f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                curveToRelative(0.0f, -2.316f, -2.737f, -3.728f, -4.0f, -4.991f)
                close()
                moveTo(13.01f, 22.53f)
                curveToRelative(-0.558f, 0.558f, -1.462f, 0.558f, -2.02f, 0.0f)
                curveToRelative(-0.558f, -0.558f, -0.558f, -1.463f, 0.0f, -2.021f)
                lineToRelative(1.01f, -1.01f)
                lineToRelative(1.01f, 1.01f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.558f, 0.558f, 0.558f, 1.463f, 0.0f, 2.021f)
                close()
                moveTo(23.0f, 21.999f)
                lineTo(23.0f, 5.238f)
                lineToRelative(0.842f, -1.675f)
                lineToRelative(0.077f, -0.207f)
                curveToRelative(0.203f, -0.812f, 0.024f, -1.657f, -0.491f, -2.317f)
                curveToRelative(-0.516f, -0.66f, -1.292f, -1.039f, -2.13f, -1.039f)
                lineTo(2.702f, 0.0f)
                curveTo(1.864f, 0.0f, 1.088f, 0.379f, 0.573f, 1.039f)
                curveTo(0.058f, 1.699f, -0.122f, 2.544f, 0.082f, 3.356f)
                lineToRelative(0.918f, 1.865f)
                verticalLineToRelative(16.778f)
                lineTo(0.0f, 21.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-11.463f)
                curveToRelative(0.816f, -0.501f, 2.771f, -1.537f, 5.0f, -1.537f)
                reflectiveCurveToRelative(4.185f, 1.037f, 5.0f, 1.537f)
                verticalLineToRelative(11.463f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(2.149f, 2.27f)
                curveToRelative(0.079f, -0.101f, 0.255f, -0.27f, 0.553f, -0.27f)
                horizontalLineToRelative(18.595f)
                curveToRelative(0.298f, 0.0f, 0.475f, 0.169f, 0.553f, 0.27f)
                curveToRelative(0.07f, 0.09f, 0.175f, 0.27f, 0.144f, 0.515f)
                lineToRelative(-0.611f, 1.215f)
                lineTo(2.617f, 4.0f)
                lineToRelative(-0.611f, -1.215f)
                curveToRelative(-0.031f, -0.245f, 0.073f, -0.425f, 0.144f, -0.515f)
                close()
                moveTo(19.0f, 22.0f)
                verticalLineToRelative(-10.503f)
                lineToRelative(-0.403f, -0.3f)
                curveToRelative(-0.121f, -0.09f, -2.994f, -2.197f, -6.597f, -2.197f)
                reflectiveCurveToRelative(-6.477f, 2.107f, -6.597f, 2.197f)
                lineToRelative(-0.403f, 0.3f)
                verticalLineToRelative(10.503f)
                horizontalLineToRelative(-2.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
