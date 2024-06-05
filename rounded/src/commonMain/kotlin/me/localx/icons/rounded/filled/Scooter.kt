package me.localx.icons.rounded.filled

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

public val Icons.Filled.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.288f, 18.029f)
                lineToRelative(-3.56f, -14.242f)
                curveToRelative(-0.558f, -2.23f, -2.552f, -3.787f, -4.851f, -3.787f)
                horizontalLineToRelative(-0.877f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.877f)
                curveToRelative(1.379f, 0.0f, 2.576f, 0.935f, 2.911f, 2.272f)
                lineToRelative(1.908f, 7.631f)
                lineToRelative(-3.27f, 3.996f)
                curveToRelative(-0.571f, 0.7f, -1.418f, 1.101f, -2.321f, 1.101f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.779f)
                curveToRelative(-0.479f, 0.532f, -0.779f, 1.228f, -0.779f, 2.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.772f, -0.3f, -1.468f, -0.779f, -2.0f)
                horizontalLineToRelative(5.883f)
                curveToRelative(1.506f, 0.0f, 2.916f, -0.668f, 3.869f, -1.834f)
                lineToRelative(2.327f, -2.843f)
                lineToRelative(1.044f, 4.178f)
                curveToRelative(-0.809f, 0.538f, -1.345f, 1.456f, -1.345f, 2.498f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.556f, -1.195f, -2.823f, -2.712f, -2.971f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
