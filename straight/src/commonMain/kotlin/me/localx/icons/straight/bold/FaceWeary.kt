package me.localx.icons.straight.bold

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

public val Icons.Bold.FaceWeary: ImageVector
    get() {
        if (_faceWeary != null) {
            return _faceWeary!!
        }
        _faceWeary = Builder(name = "FaceWeary", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.993f, 16.0f)
                curveToRelative(-3.0f, 0.0f, -6.0f, 1.001f, -6.0f, 1.0f)
                curveToRelative(0.615f, -2.28f, 2.671f, -4.996f, 6.007f, -5.0f)
                curveToRelative(3.336f, 0.004f, 5.385f, 2.72f, 6.0f, 5.0f)
                curveToRelative(0.0f, 0.001f, -3.007f, -1.0f, -6.007f, -1.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.962f, 3.0f, 12.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                close()
                moveTo(18.89f, 8.462f)
                reflectiveCurveToRelative(-2.236f, 0.033f, -3.137f, -0.401f)
                reflectiveCurveToRelative(-2.269f, -2.203f, -2.269f, -2.203f)
                curveToRelative(-0.708f, 1.47f, -0.835f, 4.038f, 0.967f, 4.906f)
                reflectiveCurveToRelative(3.731f, -0.832f, 4.439f, -2.302f)
                close()
                moveTo(9.548f, 10.764f)
                curveToRelative(1.802f, -0.868f, 1.675f, -3.436f, 0.967f, -4.906f)
                curveToRelative(0.0f, 0.0f, -1.368f, 1.769f, -2.269f, 2.203f)
                reflectiveCurveToRelative(-3.137f, 0.401f, -3.137f, 0.401f)
                curveToRelative(0.708f, 1.47f, 2.637f, 3.17f, 4.439f, 2.302f)
                close()
            }
        }
        .build()
        return _faceWeary!!
    }

private var _faceWeary: ImageVector? = null
