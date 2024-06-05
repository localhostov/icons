package me.localx.icons.rounded.bold

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

public val Icons.Bold.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.51f, 24.0f)
                horizontalLineTo(4.488f)
                arcTo(4.445f, 4.445f, 0.0f, false, true, 0.656f, 21.831f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.145f, -4.42f)
                lineTo(8.022f, 2.428f)
                arcTo(4.463f, 4.463f, 0.0f, false, true, 12.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.465f, 4.465f, 0.0f, false, true, 3.977f, 2.428f)
                lineToRelative(7.52f, 15.0f)
                arcTo(4.508f, 4.508f, 0.0f, false, true, 19.51f, 24.0f)
                close()
                moveTo(10.677f, 3.808f)
                lineTo(3.171f, 18.781f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.04f, 1.49f)
                arcToRelative(1.471f, 1.471f, 0.0f, false, false, 1.277f, 0.723f)
                horizontalLineTo(19.51f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.326f, -2.2f)
                lineToRelative(-7.519f, -15.0f)
                arcTo(1.462f, 1.462f, 0.0f, false, false, 12.0f, 3.006f)
                horizontalLineToRelative(0.0f)
                arcTo(1.468f, 1.468f, 0.0f, false, false, 10.677f, 3.808f)
                close()
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
