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

public val Icons.Outline.Webcam: ImageVector
    get() {
        if (_webcam != null) {
            return _webcam!!
        }
        _webcam = Builder(name = "Webcam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(16.709f, 18.82f)
                curveToRelative(3.146f, -1.687f, 5.291f, -5.007f, 5.291f, -8.82f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.486f, 2.0f, 10.0f)
                curveToRelative(0.0f, 3.812f, 2.145f, 7.133f, 5.291f, 8.82f)
                curveToRelative(-1.153f, 1.046f, -1.931f, 2.451f, -2.193f, 4.015f)
                lineToRelative(-0.196f, 1.166f)
                horizontalLineToRelative(14.197f)
                lineToRelative(-0.196f, -1.166f)
                curveToRelative(-0.263f, -1.564f, -1.041f, -2.969f, -2.193f, -4.015f)
                close()
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                close()
                moveTo(7.415f, 22.0f)
                curveToRelative(0.419f, -0.963f, 1.137f, -1.777f, 2.068f, -2.321f)
                curveToRelative(0.804f, 0.209f, 1.648f, 0.321f, 2.517f, 0.321f)
                reflectiveCurveToRelative(1.712f, -0.112f, 2.517f, -0.321f)
                curveToRelative(0.931f, 0.544f, 1.649f, 1.358f, 2.068f, 2.321f)
                lineTo(7.415f, 22.0f)
                close()
            }
        }
        .build()
        return _webcam!!
    }

private var _webcam: ImageVector? = null
