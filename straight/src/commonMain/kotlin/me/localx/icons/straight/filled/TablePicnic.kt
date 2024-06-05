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

public val Icons.Filled.TablePicnic: ImageVector
    get() {
        if (_tablePicnic != null) {
            return _tablePicnic!!
        }
        _tablePicnic = Builder(name = "TablePicnic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                horizontalLineToRelative(-3.808f)
                lineToRelative(-2.961f, -7.0f)
                horizontalLineToRelative(3.769f)
                lineTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.769f)
                lineToRelative(-2.961f, 7.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.962f, 14.0f)
                lineTo(0.0f, 21.0f)
                lineTo(2.172f, 21.0f)
                lineToRelative(2.962f, -7.0f)
                horizontalLineToRelative(13.734f)
                lineToRelative(2.962f, 7.0f)
                horizontalLineToRelative(2.172f)
                lineToRelative(-2.962f, -7.0f)
                horizontalLineToRelative(2.962f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.979f, 12.0f)
                lineToRelative(2.962f, -7.0f)
                horizontalLineToRelative(6.119f)
                lineToRelative(2.962f, 7.0f)
                lineTo(5.979f, 12.0f)
                close()
            }
        }
        .build()
        return _tablePicnic!!
    }

private var _tablePicnic: ImageVector? = null
