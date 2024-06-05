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

public val Icons.Filled.HockeySticks: ImageVector
    get() {
        if (_hockeySticks != null) {
            return _hockeySticks!!
        }
        _hockeySticks = Builder(name = "HockeySticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.269f, 24.0f)
                lineTo(5.5f, 24.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 0.025f, 17.963f)
                arcTo(5.649f, 5.649f, 0.0f, false, true, 5.693f, 13.0f)
                horizontalLineToRelative(7.131f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, false, 3.827f, -2.838f)
                lineTo(19.09f, 2.128f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 21.962f, 0.0f)
                horizontalLineToRelative(2.009f)
                lineTo(18.838f, 16.905f)
                arcTo(9.943f, 9.943f, 0.0f, false, true, 9.269f, 24.0f)
                close()
                moveTo(21.769f, 14.146f)
                lineTo(20.755f, 17.486f)
                arcTo(11.958f, 11.958f, 0.0f, false, true, 15.918f, 24.0f)
                lineTo(18.5f, 24.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.474f, -6.037f)
                arcTo(5.391f, 5.391f, 0.0f, false, false, 21.766f, 14.146f)
                close()
                moveTo(5.693f, 11.0f)
                lineTo(7.682f, 11.0f)
                arcToRelative(3.939f, 3.939f, 0.0f, false, true, -0.372f, -0.838f)
                lineTo(4.871f, 2.128f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(0.029f, 0.0f)
                lineToRelative(3.44f, 11.329f)
                arcTo(7.746f, 7.746f, 0.0f, false, true, 5.693f, 11.0f)
                close()
            }
        }
        .build()
        return _hockeySticks!!
    }

private var _hockeySticks: ImageVector? = null
