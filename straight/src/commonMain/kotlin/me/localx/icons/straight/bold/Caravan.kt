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

public val Icons.Bold.Caravan: ImageVector
    get() {
        if (_caravan != null) {
            return _caravan!!
        }
        _caravan = Builder(name = "Caravan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 7.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 11.0f, 20.5f)
                close()
                moveTo(10.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(22.0f, 17.0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 0.0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineTo(19.885f)
                horizontalLineTo(2.0f)
                arcToRelative(5.454f, 5.454f, 0.0f, false, true, 1.0f, -2.673f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.363f)
                arcTo(5.457f, 5.457f, 0.0f, false, true, 12.975f, 20.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _caravan!!
    }

private var _caravan: ImageVector? = null
