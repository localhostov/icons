package me.localx.icons.straight.filled

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

public val Icons.Filled.OliveOil: ImageVector
    get() {
        if (_oliveOil != null) {
            return _oliveOil!!
        }
        _oliveOil = Builder(name = "OliveOil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                arcToRelative(3.981f, 3.981f, 0.0f, false, false, -6.0f, -3.45f)
                lineTo(15.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(9.0f, 8.0f)
                curveToRelative(0.0f, 0.661f, -1.212f, 1.68f, -2.281f, 2.579f)
                arcTo(18.058f, 18.058f, 0.0f, false, false, 4.19f, 13.0f)
                lineTo(17.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
                moveTo(15.113f, 8.333f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.528f, 2.552f)
                curveToRelative(-0.12f, -0.1f, -0.241f, -0.206f, -0.36f, -0.306f)
                arcTo(8.816f, 8.816f, 0.0f, false, true, 15.113f, 8.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.142f, 15.0f)
                arcTo(3.92f, 3.92f, 0.0f, false, false, 3.0f, 16.0f)
                curveToRelative(0.0f, 2.6f, 1.453f, 3.939f, 2.991f, 5.356f)
                lineToRelative(0.5f, 0.468f)
                arcTo(1.616f, 1.616f, 0.0f, false, true, 7.0f, 23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, 0.5f, -1.177f)
                lineToRelative(0.5f, -0.467f)
                curveTo(19.547f, 19.939f, 21.0f, 18.6f, 21.0f, 16.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, -0.142f, -1.0f)
                close()
            }
        }
        .build()
        return _oliveOil!!
    }

private var _oliveOil: ImageVector? = null
