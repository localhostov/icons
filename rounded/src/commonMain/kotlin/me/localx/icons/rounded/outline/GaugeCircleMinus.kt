package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.GaugeCircleMinus: ImageVector
    get() {
        if (_gaugeCircleMinus != null) {
            return _gaugeCircleMinus!!
        }
        _gaugeCircleMinus = Builder(name = "GaugeCircleMinus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(20.5f, 19.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.0f)
                curveToRelative(0.0f, -0.738f, -0.405f, -1.376f, -1.0f, -1.723f)
                verticalLineToRelative(-4.277f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.277f)
                curveToRelative(-0.595f, 0.346f, -1.0f, 0.984f, -1.0f, 1.723f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.71f, 16.607f)
                lineToRelative(-0.934f, 0.807f)
                curveToRelative(-0.323f, 0.278f, -0.811f, 0.267f, -1.11f, -0.029f)
                curveToRelative(-2.005f, -1.986f, -2.95f, -4.744f, -2.591f, -7.566f)
                curveToRelative(0.513f, -4.042f, 3.828f, -7.305f, 7.879f, -7.76f)
                curveToRelative(5.1f, -0.567f, 9.498f, 3.072f, 9.999f, 8.02f)
                curveToRelative(0.057f, 0.549f, 0.539f, 0.952f, 1.096f, 0.894f)
                curveToRelative(0.55f, -0.056f, 0.95f, -0.546f, 0.895f, -1.096f)
                curveTo(21.33f, 3.831f, 15.893f, -0.618f, 9.732f, 0.071f)
                curveTo(4.774f, 0.627f, 0.719f, 4.621f, 0.091f, 9.567f)
                curveToRelative(-0.437f, 3.445f, 0.718f, 6.812f, 3.168f, 9.239f)
                curveToRelative(0.541f, 0.536f, 1.257f, 0.807f, 1.976f, 0.807f)
                curveToRelative(0.658f, 0.0f, 1.319f, -0.228f, 1.849f, -0.686f)
                lineToRelative(0.933f, -0.807f)
                curveToRelative(0.418f, -0.361f, 0.464f, -0.993f, 0.103f, -1.41f)
                curveToRelative(-0.362f, -0.418f, -0.993f, -0.464f, -1.41f, -0.103f)
                close()
            }
        }
        .build()
        return _gaugeCircleMinus!!
    }

private var _gaugeCircleMinus: ImageVector? = null
