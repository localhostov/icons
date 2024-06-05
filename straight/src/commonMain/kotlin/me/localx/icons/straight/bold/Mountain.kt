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

public val Icons.Bold.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, -0.101f)
                lineTo(0.0f, 21.613f)
                verticalLineToRelative(2.387f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.387f)
                lineTo(12.0f, -0.101f)
                close()
                moveTo(3.767f, 21.0f)
                lineToRelative(4.607f, -8.336f)
                lineToRelative(2.127f, 2.836f)
                lineToRelative(2.5f, -3.5f)
                lineToRelative(1.817f, 2.5f)
                lineToRelative(0.953f, -1.576f)
                lineToRelative(4.463f, 8.076f)
                horizontalLineTo(3.767f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
