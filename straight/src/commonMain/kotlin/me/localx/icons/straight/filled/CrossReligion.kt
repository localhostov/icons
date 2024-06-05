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

public val Icons.Filled.CrossReligion: ImageVector
    get() {
        if (_crossReligion != null) {
            return _crossReligion!!
        }
        _crossReligion = Builder(name = "CrossReligion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 7.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _crossReligion!!
    }

private var _crossReligion: ImageVector? = null
