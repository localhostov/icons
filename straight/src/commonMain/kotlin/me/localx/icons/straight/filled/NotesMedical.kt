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

public val Icons.Filled.NotesMedical: ImageVector
    get() {
        if (_notesMedical != null) {
            return _notesMedical!!
        }
        _notesMedical = Builder(name = "NotesMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 7.0f)
                verticalLineToRelative(17.0f)
                reflectiveCurveToRelative(20.0f, 0.0f, 20.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(-18.0f, 0.0f, -18.0f, 0.0f)
                lineTo(2.0f, 4.184f)
                curveTo(0.806f, 4.606f, 0.005f, 5.733f, 0.0f, 7.0f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 19.414f)
                verticalLineToRelative(-4.414f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, 4.414f)
                close()
            }
        }
        .build()
        return _notesMedical!!
    }

private var _notesMedical: ImageVector? = null
