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

public val Icons.Filled.BellSchool: ImageVector
    get() {
        if (_bellSchool != null) {
            return _bellSchool!!
        }
        _bellSchool = Builder(name = "BellSchool", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.624f, 5.933f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, true, -10.624f, 9.025f)
                verticalLineToRelative(-2.029f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 7.905f, -5.4f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, true, 0.0f, -9.052f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -9.905f, 14.472f)
                verticalLineToRelative(4.051f)
                horizontalLineToRelative(1.0f)
                arcToRelative(14.015f, 14.015f, 0.0f, false, false, 14.0f, -14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bellSchool!!
    }

private var _bellSchool: ImageVector? = null
