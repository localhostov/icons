package me.localx.icons.straight.filled

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

public val Icons.Filled.BroomBall: ImageVector
    get() {
        if (_broomBall != null) {
            return _broomBall!!
        }
        _broomBall = Builder(name = "BroomBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(14.128f, 11.286f)
                lineTo(23.948f, 1.465f)
                lineTo(22.534f, 0.051f)
                lineToRelative(-9.82f, 9.82f)
                lineToRelative(-1.853f, -1.853f)
                lineToRelative(-1.595f, 3.19f)
                curveToRelative(-0.47f, -0.137f, -0.963f, -0.209f, -1.467f, -0.209f)
                curveToRelative(-1.389f, 0.0f, -2.694f, 0.541f, -3.677f, 1.523f)
                curveToRelative(-1.757f, 1.757f, -3.307f, 8.439f, -3.6f, 9.761f)
                lineToRelative(-0.339f, 1.532f)
                lineToRelative(1.531f, -0.339f)
                curveToRelative(1.322f, -0.293f, 8.004f, -1.842f, 9.761f, -3.6f)
                curveToRelative(0.982f, -0.982f, 1.523f, -2.288f, 1.523f, -3.677f)
                curveToRelative(0.0f, -0.504f, -0.071f, -0.996f, -0.209f, -1.467f)
                lineToRelative(3.19f, -1.595f)
                lineToRelative(-1.853f, -1.853f)
                close()
            }
        }
        .build()
        return _broomBall!!
    }

private var _broomBall: ImageVector? = null
