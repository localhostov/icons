package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 24.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 8.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 21.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 15.5f, 24.0f)
                close()
                moveTo(8.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.5f, 21.0f)
                horizontalLineToRelative(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.5f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 16.5f, 15.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 12.0f, 19.5f)
                close()
                moveTo(12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
