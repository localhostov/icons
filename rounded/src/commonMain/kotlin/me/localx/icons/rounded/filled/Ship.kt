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

public val Icons.Filled.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                curveToRelative(0.0f, 1.626f, -1.718f, 3.0f, -3.75f, 3.0f)
                arcTo(4.208f, 4.208f, 0.0f, false, true, 17.5f, 23.0f)
                arcToRelative(4.317f, 4.317f, 0.0f, false, true, -5.5f, 0.014f)
                arcTo(4.295f, 4.295f, 0.0f, false, true, 6.513f, 23.0f)
                arcTo(4.212f, 4.212f, 0.0f, false, true, 3.75f, 24.0f)
                curveTo(1.718f, 24.0f, 0.0f, 22.626f, 0.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 0.306f, 0.661f, 1.0f, 1.75f, 1.0f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, false, 1.6f, -0.684f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, false, -0.133f, -0.189f)
                arcToRelative(12.188f, 12.188f, 0.0f, false, true, -3.187f, -6.183f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.006f, -3.388f)
                lineTo(11.0f, 9.279f)
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(9.279f)
                lineToRelative(6.931f, 2.275f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, true, 2.0f, 3.388f)
                arcToRelative(12.152f, 12.152f, 0.0f, false, true, -3.156f, 6.183f)
                arcToRelative(1.932f, 1.932f, 0.0f, false, false, -0.128f, 0.184f)
                arcTo(2.023f, 2.023f, 0.0f, false, false, 20.25f, 22.0f)
                curveToRelative(1.068f, 0.0f, 1.75f, -0.656f, 1.75f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(5.839f, 5.839f, 0.0f, false, true, 1.624f, 0.378f)
                lineTo(20.0f, 9.471f)
                verticalLineTo(7.4f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 16.6f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.4f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 4.0f, 7.4f)
                verticalLineTo(9.463f)
                lineToRelative(6.379f, -2.085f)
                arcTo(5.753f, 5.753f, 0.0f, false, true, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
