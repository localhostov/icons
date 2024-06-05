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

public val Icons.Filled.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.861f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                arcToRelative(1.959f, 1.959f, 0.0f, false, true, 2.0f, -2.0f)
                curveTo(15.083f, 0.0f, 22.746f, 0.1f, 23.861f, 8.0f)
                close()
                moveTo(6.505f, 10.0f)
                lineTo(4.244f, 7.457f)
                curveTo(3.462f, 6.449f, 0.284f, 4.946f, 0.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 8.0f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, 1.749f, 0.786f)
                lineTo(4.0f, 10.193f)
                verticalLineTo(11.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(2.865f)
                lineTo(9.257f, 19.129f)
                curveTo(5.576f, 18.113f, 4.685f, 23.824f, 8.5f, 24.0f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, 2.261f, -3.551f)
                lineTo(14.0f, 16.562f)
                lineToRelative(3.239f, 3.887f)
                arcTo(2.506f, 2.506f, 0.0f, false, false, 19.5f, 24.0f)
                curveToRelative(3.816f, -0.177f, 2.923f, -5.887f, -0.757f, -4.871f)
                lineTo(16.135f, 16.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
