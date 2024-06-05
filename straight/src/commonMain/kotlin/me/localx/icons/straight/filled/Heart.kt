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

public val Icons.Filled.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 0.917f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -5.5f, 3.3f)
                arcTo(6.4f, 6.4f, 0.0f, false, false, 6.5f, 0.917f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 0.0f, 7.967f)
                curveToRelative(0.0f, 6.775f, 10.956f, 14.6f, 11.422f, 14.932f)
                lineToRelative(0.578f, 0.409f)
                lineToRelative(0.578f, -0.409f)
                curveTo(13.044f, 22.569f, 24.0f, 14.742f, 24.0f, 7.967f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 17.5f, 0.917f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
