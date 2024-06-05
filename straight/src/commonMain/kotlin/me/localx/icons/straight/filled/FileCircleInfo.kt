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

public val Icons.Filled.FileCircleInfo: ImageVector
    get() {
        if (_fileCircleInfo != null) {
            return _fileCircleInfo!!
        }
        _fileCircleInfo = Builder(name = "FileCircleInfo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.41f, 5.0f)
                horizontalLineToRelative(-4.41f)
                lineTo(13.0f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(11.07f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.34f, 1.34f, 0.0f, 3.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 1.46f, 0.4f, 2.82f, 1.08f, 4.0f)
                close()
            }
        }
        .build()
        return _fileCircleInfo!!
    }

private var _fileCircleInfo: ImageVector? = null
