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

public val Icons.Bold.ShekelSign: ImageVector
    get() {
        if (_shekelSign != null) {
            return _shekelSign!!
        }
        _shekelSign = Builder(name = "ShekelSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 24.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(8.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(24.0f)
                close()
                moveTo(23.0f, 15.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(15.5f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                close()
            }
        }
        .build()
        return _shekelSign!!
    }

private var _shekelSign: ImageVector? = null
