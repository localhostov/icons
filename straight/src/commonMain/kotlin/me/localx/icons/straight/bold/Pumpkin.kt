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

public val Icons.Bold.Pumpkin: ImageVector
    get() {
        if (_pumpkin != null) {
            return _pumpkin!!
        }
        _pumpkin = Builder(name = "Pumpkin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 6.0f)
                arcToRelative(5.037f, 5.037f, 0.0f, false, false, -2.276f, 0.625f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -0.673f, -0.321f)
                curveTo(13.894f, 3.106f, 15.977f, 3.0f, 16.0f, 3.0f)
                arcToRelative(0.879f, 0.879f, 0.0f, false, true, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(3.869f, 3.869f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -3.953f, 2.071f)
                arcTo(6.216f, 6.216f, 0.0f, false, false, 9.807f, 0.158f)
                lineTo(8.465f, 2.842f)
                curveToRelative(0.454f, 0.226f, 1.736f, 0.876f, 1.988f, 3.46f)
                arcToRelative(4.657f, 4.657f, 0.0f, false, false, -0.688f, 0.329f)
                arcTo(5.08f, 5.08f, 0.0f, false, false, 7.5f, 6.0f)
                curveTo(4.538f, 6.0f, 0.0f, 10.032f, 0.0f, 15.0f)
                reflectiveCurveToRelative(4.547f, 9.0f, 7.515f, 9.0f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, false, 2.072f, -0.736f)
                arcToRelative(4.322f, 4.322f, 0.0f, false, false, 4.825f, 0.0f)
                arcTo(3.259f, 3.259f, 0.0f, false, false, 16.484f, 24.0f)
                curveTo(19.452f, 24.0f, 24.0f, 19.968f, 24.0f, 15.0f)
                reflectiveCurveTo(19.462f, 6.0f, 16.5f, 6.0f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.0f, -3.339f, 3.231f, -6.0f, 4.5f, -6.0f)
                horizontalLineToRelative(0.0f)
                arcTo(11.879f, 11.879f, 0.0f, false, false, 6.0f, 15.0f)
                arcToRelative(11.884f, 11.884f, 0.0f, false, false, 1.5f, 6.0f)
                curveTo(6.217f, 20.979f, 3.0f, 18.327f, 3.0f, 15.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-1.416f, 0.0f, -3.0f, -2.566f, -3.0f, -6.0f)
                reflectiveCurveToRelative(1.584f, -6.0f, 3.0f, -6.0f)
                reflectiveCurveToRelative(3.0f, 2.566f, 3.0f, 6.0f)
                reflectiveCurveTo(13.416f, 21.0f, 12.0f, 21.0f)
                close()
                moveTo(16.5f, 21.0f)
                arcTo(11.884f, 11.884f, 0.0f, false, false, 18.0f, 15.0f)
                arcToRelative(11.879f, 11.879f, 0.0f, false, false, -1.5f, -6.0f)
                horizontalLineToRelative(0.0f)
                curveTo(17.77f, 9.0f, 21.0f, 11.661f, 21.0f, 15.0f)
                reflectiveCurveTo(17.783f, 20.978f, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _pumpkin!!
    }

private var _pumpkin: ImageVector? = null
