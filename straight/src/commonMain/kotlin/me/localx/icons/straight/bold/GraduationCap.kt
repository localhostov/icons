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

public val Icons.Bold.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.12f, 1.627f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.24f, 0.0f)
                lineToRelative(-9.88f, 6.373f)
                lineToRelative(5.0f, 3.225f)
                verticalLineToRelative(8.794f)
                lineToRelative(0.32f, 0.408f)
                curveToRelative(0.207f, 0.263f, 2.153f, 2.573f, 6.68f, 2.573f)
                reflectiveCurveToRelative(6.473f, -2.31f, 6.68f, -2.573f)
                lineToRelative(0.32f, -0.408f)
                verticalLineToRelative(-8.794f)
                lineToRelative(2.0f, -1.29f)
                verticalLineToRelative(10.065f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(11.506f, 4.148f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.988f, 0.0f)
                lineToRelative(5.971f, 3.852f)
                lineToRelative(-5.971f, 3.851f)
                arcToRelative(0.893f, 0.893f, 0.0f, false, true, -0.988f, 0.0f)
                lineToRelative(-5.971f, -3.851f)
                close()
                moveTo(16.0f, 18.858f)
                arcToRelative(6.408f, 6.408f, 0.0f, false, true, -4.0f, 1.142f)
                arcToRelative(6.421f, 6.421f, 0.0f, false, true, -4.0f, -1.139f)
                verticalLineToRelative(-5.7f)
                lineToRelative(1.88f, 1.213f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 4.24f, 0.0f)
                lineToRelative(1.88f, -1.214f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
