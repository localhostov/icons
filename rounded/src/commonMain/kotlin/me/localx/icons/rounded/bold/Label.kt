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

public val Icons.Bold.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.214f, 4.392f)
                lineToRelative(-7.48f, -4.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.468f, 0.0f)
                lineToRelative(-7.48f, 4.2f)
                arcTo(3.505f, 3.505f, 0.0f, false, false, 2.0f, 7.443f)
                verticalLineTo(17.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 22.0f, 17.5f)
                verticalLineTo(7.443f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 20.214f, 4.392f)
                close()
                moveTo(19.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.0f, 17.5f)
                verticalLineTo(7.443f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.255f, -0.436f)
                lineTo(12.0f, 3.221f)
                lineToRelative(6.744f, 3.786f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 19.0f, 7.443f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null
