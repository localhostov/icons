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

public val Icons.Bold.Lion: ImageVector
    get() {
        if (_lion != null) {
            return _lion!!
        }
        _lion = Builder(name = "Lion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.488f, 5.371f)
                lineToRelative(-0.62f, -0.542f)
                curveToRelative(-0.547f, -2.75f, -2.957f, -4.829f, -5.868f, -4.829f)
                curveToRelative(-2.972f, 0.0f, -6.0f, 2.0f, -6.5f, 5.0f)
                horizontalLineToRelative(3.0f)
                reflectiveCurveToRelative(-0.082f, 0.033f, -0.216f, 0.105f)
                curveToRelative(-1.582f, 0.85f, -2.784f, 2.395f, -2.784f, 3.895f)
                curveToRelative(0.0f, 1.232f, 0.5f, 3.0f, 2.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.281f, 0.983f, 1.391f, 4.126f, 4.044f, 7.001f)
                lineToRelative(-9.454f, 0.033f)
                curveToRelative(-0.051f, -0.14f, -0.102f, -0.279f, -0.154f, -0.418f)
                curveToRelative(-0.385f, -1.034f, -0.717f, -1.928f, -0.711f, -3.051f)
                curveToRelative(0.004f, -0.834f, 0.784f, -1.565f, 1.669f, -1.565f)
                horizontalLineToRelative(0.796f)
                curveToRelative(-0.562f, -1.184f, -0.69f, -2.272f, -0.69f, -3.0f)
                curveToRelative(0.0f, 0.0f, -0.312f, 0.011f, -0.41f, 0.031f)
                curveToRelative(-1.174f, 0.08f, -2.245f, 0.594f, -3.033f, 1.393f)
                curveToRelative(-1.065f, 0.57f, -4.057f, 2.775f, -4.057f, 9.576f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.285f, 0.126f, -2.33f, 0.315f, -3.195f)
                curveToRelative(0.101f, 0.296f, 0.207f, 0.582f, 0.31f, 0.857f)
                curveToRelative(0.131f, 0.354f, 0.264f, 0.706f, 0.378f, 1.069f)
                lineToRelative(0.062f, 5.269f)
                horizontalLineToRelative(4.016f)
                lineToRelative(-0.041f, -3.971f)
                lineToRelative(6.96f, -0.024f)
                verticalLineToRelative(3.995f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.842f)
                lineToRelative(1.099f, -5.158f)
                horizontalLineToRelative(0.401f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.621f)
                lineToRelative(-1.512f, -1.508f)
                close()
                moveTo(16.092f, 6.688f)
                curveToRelative(0.169f, -0.75f, 0.603f, -1.409f, 1.187f, -1.889f)
                lineToRelative(3.161f, 2.762f)
                lineToRelative(0.561f, 0.561f)
                verticalLineToRelative(1.379f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-0.833f, -0.807f, -1.281f, -2.01f, -0.988f, -3.312f)
                close()
            }
        }
        .build()
        return _lion!!
    }

private var _lion: ImageVector? = null
