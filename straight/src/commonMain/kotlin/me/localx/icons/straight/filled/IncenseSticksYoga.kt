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

public val Icons.Filled.IncenseSticksYoga: ImageVector
    get() {
        if (_incenseSticksYoga != null) {
            return _incenseSticksYoga!!
        }
        _incenseSticksYoga = Builder(name = "IncenseSticksYoga", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.528f, 18.01f)
                lineToRelative(1.472f, -4.01f)
                horizontalLineToRelative(-7.263f)
                lineToRelative(2.741f, -12.791f)
                lineToRelative(-1.955f, -0.419f)
                lineToRelative(-2.831f, 13.209f)
                horizontalLineToRelative(-1.692f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-1.692f)
                lineTo(6.478f, 0.791f)
                lineToRelative(-1.955f, 0.419f)
                lineToRelative(2.741f, 12.791f)
                horizontalLineTo(0.0f)
                lineToRelative(1.43f, 3.909f)
                lineToRelative(0.045f, 0.104f)
                curveToRelative(0.797f, 1.59f, 1.57f, 2.331f, 2.587f, 2.681f)
                curveToRelative(-0.264f, 0.356f, -0.524f, 0.764f, -0.785f, 1.285f)
                lineToRelative(-0.743f, 2.02f)
                horizontalLineToRelative(2.118f)
                lineToRelative(0.437f, -1.174f)
                curveToRelative(0.814f, -1.61f, 1.249f, -1.804f, 2.708f, -1.828f)
                lineToRelative(8.137f, -0.004f)
                curveToRelative(1.901f, 0.013f, 2.276f, 0.256f, 3.081f, 1.839f)
                lineToRelative(0.435f, 1.166f)
                horizontalLineToRelative(2.119f)
                lineToRelative(-0.696f, -1.908f)
                lineToRelative(-0.047f, -0.108f)
                curveToRelative(-0.269f, -0.531f, -0.535f, -0.967f, -0.807f, -1.328f)
                curveToRelative(0.973f, -0.366f, 1.732f, -1.109f, 2.509f, -2.645f)
                close()
            }
        }
        .build()
        return _incenseSticksYoga!!
    }

private var _incenseSticksYoga: ImageVector? = null
