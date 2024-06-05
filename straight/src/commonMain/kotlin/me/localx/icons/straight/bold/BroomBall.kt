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

public val Icons.Bold.BroomBall: ImageVector
    get() {
        if (_broomBall != null) {
            return _broomBall!!
        }
        _broomBall = Builder(name = "BroomBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.984f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(16.5f, 12.984f)
                lineToRelative(-2.665f, 1.332f)
                curveToRelative(0.108f, 0.442f, 0.164f, 0.901f, 0.164f, 1.368f)
                curveToRelative(0.0f, 1.522f, -0.593f, 2.954f, -1.67f, 4.031f)
                curveToRelative(-1.809f, 1.809f, -8.115f, 3.315f, -10.006f, 3.733f)
                lineTo(0.026f, 23.957f)
                lineToRelative(0.509f, -2.298f)
                curveToRelative(0.419f, -1.89f, 1.926f, -8.197f, 3.734f, -10.005f)
                curveToRelative(1.077f, -1.077f, 2.508f, -1.67f, 4.03f, -1.67f)
                curveToRelative(0.467f, 0.0f, 0.926f, 0.056f, 1.368f, 0.165f)
                lineToRelative(1.332f, -2.664f)
                lineToRelative(1.689f, 1.689f)
                lineTo(21.862f, 0.0f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-9.173f, 9.173f)
                lineToRelative(1.69f, 1.69f)
                close()
                moveTo(11.0f, 15.684f)
                curveToRelative(0.0f, -0.721f, -0.281f, -1.399f, -0.791f, -1.909f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.51f, -0.511f, -1.188f, -0.792f, -1.909f, -0.792f)
                reflectiveCurveToRelative(-1.398f, 0.281f, -1.909f, 0.791f)
                curveToRelative(-0.639f, 0.639f, -1.591f, 3.355f, -2.344f, 6.162f)
                curveToRelative(2.807f, -0.753f, 5.523f, -1.705f, 6.162f, -2.344f)
                curveToRelative(0.51f, -0.51f, 0.791f, -1.188f, 0.791f, -1.909f)
                close()
            }
        }
        .build()
        return _broomBall!!
    }

private var _broomBall: ImageVector? = null
