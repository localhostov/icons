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

public val Icons.Outline.GaugeCirclePlus: ImageVector
    get() {
        if (_gaugeCirclePlus != null) {
            return _gaugeCirclePlus!!
        }
        _gaugeCirclePlus = Builder(name = "GaugeCirclePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
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
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
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
                moveToRelative(6.709f, 16.607f)
                lineToRelative(-0.933f, 0.807f)
                curveToRelative(-0.321f, 0.279f, -0.812f, 0.268f, -1.109f, -0.029f)
                curveToRelative(-2.006f, -1.986f, -2.95f, -4.744f, -2.592f, -7.566f)
                curveToRelative(0.513f, -4.042f, 3.827f, -7.305f, 7.88f, -7.76f)
                curveToRelative(5.076f, -0.568f, 9.496f, 3.072f, 9.998f, 8.02f)
                curveToRelative(0.057f, 0.549f, 0.546f, 0.952f, 1.096f, 0.894f)
                curveToRelative(0.55f, -0.056f, 0.95f, -0.546f, 0.895f, -1.096f)
                curveTo(21.33f, 3.831f, 15.899f, -0.618f, 9.732f, 0.071f)
                curveTo(4.773f, 0.627f, 0.719f, 4.621f, 0.091f, 9.567f)
                curveToRelative(-0.438f, 3.444f, 0.718f, 6.812f, 3.168f, 9.239f)
                curveToRelative(0.541f, 0.536f, 1.257f, 0.806f, 1.977f, 0.806f)
                curveToRelative(0.658f, 0.0f, 1.319f, -0.227f, 1.85f, -0.686f)
                lineToRelative(0.933f, -0.807f)
                curveToRelative(0.418f, -0.361f, 0.463f, -0.993f, 0.102f, -1.411f)
                curveToRelative(-0.361f, -0.417f, -0.992f, -0.463f, -1.41f, -0.102f)
                close()
            }
        }
        .build()
        return _gaugeCirclePlus!!
    }

private var _gaugeCirclePlus: ImageVector? = null
