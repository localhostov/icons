package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Employees: ImageVector
    get() {
        if (_employees != null) {
            return _employees!!
        }
        _employees = Builder(name = "Employees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 8.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.791f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveTo(14.209f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(6.5f, 16.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(23.954f, 22.131f)
                curveToRelative(-0.766f, -3.021f, -3.522f, -5.131f, -6.704f, -5.131f)
                curveToRelative(-2.082f, 0.0f, -3.97f, 0.915f, -5.25f, 2.388f)
                curveToRelative(-1.279f, -1.472f, -3.167f, -2.388f, -5.25f, -2.388f)
                curveToRelative(-3.181f, 0.0f, -5.938f, 2.11f, -6.704f, 5.131f)
                curveToRelative(-0.204f, 0.803f, 0.282f, 1.619f, 1.085f, 1.823f)
                curveToRelative(0.804f, 0.205f, 1.62f, -0.282f, 1.823f, -1.085f)
                curveToRelative(0.223f, -0.88f, 0.758f, -1.616f, 1.47f, -2.124f)
                lineToRelative(1.416f, 1.814f)
                curveToRelative(0.471f, 0.589f, 1.367f, 0.589f, 1.839f, 0.0f)
                lineToRelative(1.428f, -1.794f)
                curveToRelative(0.697f, 0.508f, 1.219f, 1.237f, 1.439f, 2.105f)
                curveToRelative(0.003f, 0.013f, 0.273f, 1.132f, 1.455f, 1.132f)
                reflectiveCurveToRelative(1.45f, -1.118f, 1.453f, -1.132f)
                curveToRelative(0.223f, -0.88f, 0.758f, -1.615f, 1.47f, -2.124f)
                lineToRelative(1.416f, 1.814f)
                curveToRelative(0.471f, 0.589f, 1.367f, 0.589f, 1.839f, 0.0f)
                lineToRelative(1.428f, -1.794f)
                curveToRelative(0.698f, 0.508f, 1.219f, 1.237f, 1.439f, 2.105f)
                curveToRelative(0.203f, 0.803f, 1.024f, 1.289f, 1.822f, 1.085f)
                curveToRelative(0.804f, -0.204f, 1.289f, -1.02f, 1.086f, -1.823f)
                close()
            }
        }
        .build()
        return _employees!!
    }

private var _employees: ImageVector? = null
