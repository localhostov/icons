package me.localx.icons.rounded.bold

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

public val Icons.Bold.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.024f, 12.0f)
                arcToRelative(12.231f, 12.231f, 0.0f, false, false, 3.941f, -7.029f)
                arcToRelative(4.306f, 4.306f, 0.0f, false, false, -1.0f, -3.448f)
                arcToRelative(4.378f, 4.378f, 0.0f, false, false, -3.32f, -1.523f)
                horizontalLineToRelative(-9.264f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, -3.319f, 1.524f)
                arcToRelative(4.307f, 4.307f, 0.0f, false, false, -1.0f, 3.451f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.938f, 7.025f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -3.936f, 7.025f)
                arcToRelative(4.307f, 4.307f, 0.0f, false, false, 1.0f, 3.451f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, 3.317f, 1.524f)
                horizontalLineToRelative(9.264f)
                arcToRelative(4.378f, 4.378f, 0.0f, false, false, 3.318f, -1.523f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 1.0f, -3.447f)
                arcToRelative(12.23f, 12.23f, 0.0f, false, false, -3.939f, -7.03f)
                close()
                moveTo(17.69f, 20.519f)
                arcToRelative(1.381f, 1.381f, 0.0f, false, true, -1.045f, 0.481f)
                horizontalLineToRelative(-9.264f)
                arcToRelative(1.382f, 1.382f, 0.0f, false, true, -1.046f, -0.48f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.307f, -1.048f)
                curveToRelative(0.337f, -2.244f, 1.746f, -4.363f, 4.188f, -6.294f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -2.354f)
                curveToRelative(-2.442f, -1.932f, -3.851f, -4.051f, -4.188f, -6.295f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 0.307f, -1.048f)
                arcToRelative(1.382f, 1.382f, 0.0f, false, true, 1.046f, -0.481f)
                horizontalLineToRelative(9.264f)
                arcToRelative(1.381f, 1.381f, 0.0f, false, true, 1.045f, 0.481f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 0.31f, 1.045f)
                curveToRelative(-0.335f, 2.235f, -1.745f, 4.354f, -4.191f, 6.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 2.348f)
                curveToRelative(2.446f, 1.946f, 3.856f, 4.065f, 4.191f, 6.3f)
                arcToRelative(1.294f, 1.294f, 0.0f, false, true, -0.31f, 1.045f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.836f, 15.213f)
                lineToRelative(-0.294f, -0.235f)
                arcToRelative(0.871f, 0.871f, 0.0f, false, false, -1.081f, 0.0f)
                lineToRelative(-0.3f, 0.238f)
                arcToRelative(6.547f, 6.547f, 0.0f, false, false, -2.1f, 2.592f)
                arcToRelative(0.869f, 0.869f, 0.0f, false, false, 0.807f, 1.192f)
                horizontalLineToRelative(4.263f)
                arcToRelative(0.868f, 0.868f, 0.0f, false, false, 0.8f, -1.194f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, false, -2.095f, -2.593f)
                close()
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
