package me.localx.icons.straight.outline

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

public val Icons.Outline.BellSchool: ImageVector
    get() {
        if (_bellSchool != null) {
            return _bellSchool!!
        }
        _bellSchool = Builder(name = "BellSchool", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 10.0f)
                arcToRelative(14.015f, 14.015f, 0.0f, false, true, -14.0f, 14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.051f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 9.906f, -14.474f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.629f, 1.225f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 6.61f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.629f, 1.22f)
                arcToRelative(10.005f, 10.005f, 0.0f, false, true, -7.906f, 5.399f)
                verticalLineToRelative(2.029f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, 10.624f, -9.025f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 2.376f, -2.933f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bellSchool!!
    }

private var _bellSchool: ImageVector? = null
