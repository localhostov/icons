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

public val Icons.Filled.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(20.657f, 7.0f)
                lineTo(17.431f, 7.0f)
                arcTo(19.675f, 19.675f, 0.0f, false, false, 14.6f, 2.342f)
                arcTo(10.041f, 10.041f, 0.0f, false, true, 20.657f, 7.0f)
                close()
                moveTo(16.5f, 12.0f)
                arcToRelative(10.209f, 10.209f, 0.0f, false, true, -0.473f, 3.0f)
                lineTo(7.973f, 15.0f)
                arcTo(10.209f, 10.209f, 0.0f, false, true, 7.5f, 12.0f)
                arcToRelative(10.209f, 10.209f, 0.0f, false, true, 0.473f, -3.0f)
                horizontalLineToRelative(8.054f)
                arcTo(10.209f, 10.209f, 0.0f, false, true, 16.5f, 12.0f)
                close()
                moveTo(8.774f, 17.0f)
                horizontalLineToRelative(6.452f)
                arcTo(19.562f, 19.562f, 0.0f, false, true, 12.0f, 21.588f)
                arcTo(19.562f, 19.562f, 0.0f, false, true, 8.774f, 17.0f)
                close()
                moveTo(8.774f, 7.0f)
                arcTo(19.562f, 19.562f, 0.0f, false, true, 12.0f, 2.412f)
                arcTo(19.562f, 19.562f, 0.0f, false, true, 15.226f, 7.0f)
                close()
                moveTo(9.4f, 2.342f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 6.569f, 7.0f)
                lineTo(3.343f, 7.0f)
                arcTo(10.041f, 10.041f, 0.0f, false, true, 9.4f, 2.342f)
                close()
                moveTo(2.46f, 9.0f)
                lineTo(5.892f, 9.0f)
                arcToRelative(11.676f, 11.676f, 0.0f, false, false, 0.0f, 6.0f)
                lineTo(2.46f, 15.0f)
                arcToRelative(10.013f, 10.013f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(3.343f, 17.0f)
                lineTo(6.569f, 17.0f)
                arcTo(19.675f, 19.675f, 0.0f, false, false, 9.4f, 21.658f)
                arcTo(10.041f, 10.041f, 0.0f, false, true, 3.343f, 17.0f)
                close()
                moveTo(14.6f, 21.658f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 17.431f, 17.0f)
                horizontalLineToRelative(3.226f)
                arcTo(10.041f, 10.041f, 0.0f, false, true, 14.6f, 21.658f)
                close()
                moveTo(21.54f, 15.0f)
                lineTo(18.108f, 15.0f)
                arcToRelative(11.676f, 11.676f, 0.0f, false, false, 0.0f, -6.0f)
                lineTo(21.54f, 9.0f)
                arcToRelative(10.013f, 10.013f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
