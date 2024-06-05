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

public val Icons.Bold.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.513f, 3.5f)
                lineTo(12.5f, 2.0f)
                lineTo(11.0f, 2.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 8.9f, 23.8f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, false, 2.078f, 0.2f)
                arcTo(11.041f, 11.041f, 0.0f, false, false, 22.0f, 13.0f)
                lineTo(22.0f, 11.5f)
                lineTo(12.5f, 11.5f)
                close()
                moveTo(18.856f, 14.5f)
                arcTo(7.985f, 7.985f, 0.0f, true, true, 9.511f, 5.143f)
                lineTo(9.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 0.005f)
                verticalLineTo(9.5f)
                horizontalLineTo(24.0f)
                arcTo(9.542f, 9.542f, 0.0f, false, false, 14.5f, 0.005f)
                close()
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
