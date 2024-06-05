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

public val Icons.Filled.FileMedicalAlt: ImageVector
    get() {
        if (_fileMedicalAlt != null) {
            return _fileMedicalAlt!!
        }
        _fileMedicalAlt = Builder(name = "FileMedicalAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 7.0f)
                verticalLineToRelative(17.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(5.035f)
                lineToRelative(1.341f, -2.012f)
                lineToRelative(3.0f, 6.0f)
                lineToRelative(2.659f, -3.988f)
                horizontalLineToRelative(3.965f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.035f)
                lineToRelative(-1.341f, 2.012f)
                lineToRelative(-3.0f, -6.0f)
                lineToRelative(-2.659f, 3.988f)
                horizontalLineToRelative(-3.965f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(17.0f, 0.586f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineTo(17.0f, 0.586f)
                close()
            }
        }
        .build()
        return _fileMedicalAlt!!
    }

private var _fileMedicalAlt: ImageVector? = null
