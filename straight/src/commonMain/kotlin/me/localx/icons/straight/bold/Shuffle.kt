package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.657f, 17.164f)
                lineTo(20.03f, 13.537f)
                verticalLineToRelative(2.939f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, -6.173f, -3.0f)
                curveToRelative(-0.2f, 0.229f, -0.4f, 0.456f, -0.608f, 0.7f)
                curveToRelative(-0.439f, 0.508f, -0.9f, 1.034f, -1.375f, 1.559f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.03f, 19.48f)
                verticalLineToRelative(2.869f)
                lineToRelative(3.627f, -3.627f)
                arcTo(1.1f, 1.1f, 0.0f, false, false, 23.657f, 17.164f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.012f, 7.515f)
                verticalLineToRelative(2.9f)
                lineToRelative(3.642f, -3.642f)
                arcToRelative(1.106f, 1.106f, 0.0f, false, false, 0.0f, -1.564f)
                lineTo(20.012f, 1.566f)
                verticalLineTo(4.511f)
                curveToRelative(-4.526f, 0.21f, -7.253f, 2.674f, -9.523f, 5.21f)
                curveTo(8.066f, 7.04f, 5.12f, 4.487f, -0.021f, 4.487f)
                verticalLineTo(7.492f)
                curveToRelative(4.089f, 0.0f, 6.29f, 1.994f, 8.52f, 4.509f)
                curveToRelative(-2.23f, 2.515f, -4.431f, 4.507f, -8.52f, 4.507f)
                verticalLineToRelative(3.005f)
                curveToRelative(6.047f, 0.0f, 9.061f, -3.533f, 11.754f, -6.651f)
                curveTo(14.1f, 10.126f, 16.161f, 7.748f, 20.012f, 7.515f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
