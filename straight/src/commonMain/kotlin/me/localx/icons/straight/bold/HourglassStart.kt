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

public val Icons.Bold.HourglassStart: ImageVector
    get() {
        if (_hourglassStart != null) {
            return _hourglassStart!!
        }
        _hourglassStart = Builder(name = "HourglassStart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.029f, 12.0f)
                curveToRelative(2.033f, -1.972f, 3.971f, -4.837f, 3.971f, -8.591f)
                curveToRelative(0.0f, -1.88f, -1.529f, -3.409f, -3.409f, -3.409f)
                lineTo(6.409f, 0.0f)
                curveToRelative(-1.88f, 0.0f, -3.409f, 1.53f, -3.409f, 3.41f)
                curveToRelative(0.0f, 3.754f, 1.945f, 6.619f, 3.986f, 8.591f)
                curveToRelative(-2.041f, 1.971f, -3.986f, 4.835f, -3.986f, 8.59f)
                verticalLineToRelative(3.409f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.409f)
                curveToRelative(0.0f, -3.753f, -1.938f, -6.619f, -3.971f, -8.591f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-0.409f)
                curveToRelative(0.0f, -3.385f, 2.281f, -5.9f, 4.195f, -7.414f)
                lineToRelative(1.487f, -1.176f)
                lineToRelative(-1.487f, -1.176f)
                curveToRelative(-1.914f, -1.514f, -4.195f, -4.03f, -4.195f, -7.415f)
                curveToRelative(0.0f, -0.226f, 0.184f, -0.409f, 0.409f, -0.409f)
                horizontalLineToRelative(11.182f)
                curveToRelative(0.226f, 0.0f, 0.409f, 0.183f, 0.409f, 0.409f)
                curveToRelative(0.0f, 3.385f, -2.271f, 5.901f, -4.177f, 7.417f)
                lineToRelative(-1.476f, 1.174f)
                lineToRelative(1.476f, 1.174f)
                curveToRelative(1.905f, 1.516f, 4.177f, 4.032f, 4.177f, 7.417f)
                verticalLineToRelative(0.409f)
                close()
                moveTo(12.578f, 9.261f)
                lineToRelative(-0.566f, 0.45f)
                lineToRelative(-0.576f, -0.456f)
                curveToRelative(-1.229f, -0.973f, -2.644f, -2.427f, -3.197f, -4.255f)
                horizontalLineToRelative(7.524f)
                curveToRelative(-0.55f, 1.831f, -1.96f, 3.287f, -3.184f, 4.261f)
                close()
            }
        }
        .build()
        return _hourglassStart!!
    }

private var _hourglassStart: ImageVector? = null
