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

public val Icons.Bold.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7626f, 0.0f)
                horizontalLineTo(5.9525f)
                curveTo(4.3219f, 0.0f, 3.0f, 1.3219f, 3.0f, 2.9525f)
                verticalLineTo(23.9824f)
                lineTo(6.9367f, 21.2454f)
                lineTo(9.3971f, 22.9579f)
                lineTo(11.8575f, 21.2464f)
                lineTo(14.318f, 22.9579f)
                lineTo(16.7784f, 21.2474f)
                lineTo(20.7151f, 23.9883f)
                verticalLineTo(2.9525f)
                curveTo(20.7151f, 1.3219f, 19.3933f, 0.0f, 17.7626f, 0.0f)
                close()
                moveTo(17.7626f, 18.3312f)
                lineTo(16.7784f, 17.6492f)
                lineTo(14.318f, 19.3617f)
                lineTo(11.8576f, 17.6502f)
                lineTo(9.3972f, 19.3617f)
                lineTo(6.9367f, 17.6512f)
                lineTo(5.9526f, 18.3401f)
                verticalLineTo(2.9525f)
                horizontalLineTo(17.7627f)
                verticalLineTo(18.3312f)
                horizontalLineTo(17.7626f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.9991f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.9991f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.9991f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
