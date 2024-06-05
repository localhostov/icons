package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.HouseFlood: ImageVector
    get() {
        if (_houseFlood != null) {
            return _houseFlood!!
        }
        _houseFlood = Builder(name = "HouseFlood", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.009f, 22.632f)
                arcTo(3.97f, 3.97f, 0.0f, false, true, 18.0f, 22.618f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, -6.009f, 0.014f)
                lineTo(1.5f, 21.316f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.5f, 1.316f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.682f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.682f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(16.682f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 11.682f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                verticalLineTo(11.0f)
                lineTo(12.0f, 2.0f)
                lineToRelative(10.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.111f)
                lineTo(13.338f, 0.515f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.676f, 0.0f)
                lineTo(0.0f, 10.111f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _houseFlood!!
    }

private var _houseFlood: ImageVector? = null
