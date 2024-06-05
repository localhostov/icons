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

public val Icons.Bold.Snowflakes: ImageVector
    get() {
        if (_snowflakes != null) {
            return _snowflakes!!
        }
        _snowflakes = Builder(name = "Snowflakes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.137f, 15.076f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(11.25f)
                lineToRelative(2.805f, 4.42f)
                lineTo(11.505f, 24.0f)
                lineTo(8.5f, 19.257f)
                lineTo(5.5f, 24.0f)
                lineToRelative(-2.55f, -1.58f)
                lineTo(5.75f, 18.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.863f)
                lineTo(2.945f, 10.292f)
                lineTo(5.5f, 8.711f)
                lineTo(8.5f, 13.561f)
                lineToRelative(3.005f, -4.85f)
                lineToRelative(2.55f, 1.581f)
                close()
                moveTo(24.0f, 4.0f)
                horizontalLineTo(21.586f)
                lineToRelative(1.226f, -2.092f)
                lineTo(20.223f, 0.391f)
                lineTo(19.0f, 2.479f)
                lineTo(17.777f, 0.391f)
                lineTo(15.188f, 1.908f)
                lineTo(16.414f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.351f)
                lineTo(15.188f, 8.985f)
                lineTo(17.777f, 10.5f)
                lineTo(19.0f, 8.414f)
                lineTo(20.223f, 10.5f)
                lineToRelative(2.589f, -1.516f)
                lineTo(21.649f, 7.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _snowflakes!!
    }

private var _snowflakes: ImageVector? = null
