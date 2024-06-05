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

public val Icons.Bold.BellSchool: ImageVector
    get() {
        if (_bellSchool != null) {
            return _bellSchool!!
        }
        _bellSchool = Builder(name = "BellSchool", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 7.0f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, false, -0.186f, 6.981f)
                arcToRelative(11.569f, 11.569f, 0.0f, false, true, -9.314f, 6.926f)
                verticalLineToRelative(-2.04f)
                arcToRelative(9.487f, 9.487f, 0.0f, false, false, 5.65f, -3.138f)
                arcToRelative(6.513f, 6.513f, 0.0f, false, true, -1.968f, -2.344f)
                arcToRelative(6.493f, 6.493f, 0.0f, true, true, 0.62f, -6.776f)
                arcToRelative(6.513f, 6.513f, 0.0f, false, true, 2.343f, -1.942f)
                arcToRelative(9.485f, 9.485f, 0.0f, true, false, -9.645f, 14.203f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(1.5f)
                curveToRelative(8.0f, 0.0f, 14.5f, -6.056f, 14.5f, -13.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _bellSchool!!
    }

private var _bellSchool: ImageVector? = null
