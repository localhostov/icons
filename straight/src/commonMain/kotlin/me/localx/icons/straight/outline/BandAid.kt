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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.BandAid: ImageVector
    get() {
        if (_bandAid != null) {
            return _bandAid!!
        }
        _bandAid = Builder(name = "BandAid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 11.0f)
                    curveTo(10.5523f, 11.0f, 11.0f, 10.5523f, 11.0f, 10.0f)
                    curveTo(11.0f, 9.4477f, 10.5523f, 9.0f, 10.0f, 9.0f)
                    curveTo(9.4477f, 9.0f, 9.0f, 9.4477f, 9.0f, 10.0f)
                    curveTo(9.0f, 10.5523f, 9.4477f, 11.0f, 10.0f, 11.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.9999f, 11.0f)
                    curveTo(14.5521f, 11.0f, 14.9999f, 10.5523f, 14.9999f, 10.0f)
                    curveTo(14.9999f, 9.4477f, 14.5521f, 9.0f, 13.9999f, 9.0f)
                    curveTo(13.4476f, 9.0f, 12.9998f, 9.4477f, 12.9998f, 10.0f)
                    curveTo(12.9998f, 10.5523f, 13.4476f, 11.0f, 13.9999f, 11.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 15.0001f)
                    curveTo(10.5523f, 15.0001f, 11.0f, 14.5524f, 11.0f, 14.0001f)
                    curveTo(11.0f, 13.4478f, 10.5523f, 13.0001f, 10.0f, 13.0001f)
                    curveTo(9.4477f, 13.0001f, 9.0f, 13.4478f, 9.0f, 14.0001f)
                    curveTo(9.0f, 14.5524f, 9.4477f, 15.0001f, 10.0f, 15.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.9999f, 15.0001f)
                    curveTo(14.5521f, 15.0001f, 14.9999f, 14.5524f, 14.9999f, 14.0001f)
                    curveTo(14.9999f, 13.4478f, 14.5521f, 13.0001f, 13.9999f, 13.0001f)
                    curveTo(13.4476f, 13.0001f, 12.9998f, 13.4478f, 12.9998f, 14.0001f)
                    curveTo(12.9998f, 14.5524f, 13.4476f, 15.0001f, 13.9999f, 15.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 4.9999f)
                    verticalLineTo(18.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.9999f)
                    horizontalLineTo(0.0f)
                    close()
                    moveTo(17.0f, 6.9999f)
                    verticalLineTo(16.9999f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(6.9999f)
                    horizontalLineTo(17.0f)
                    close()
                    moveTo(2.0f, 6.9999f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(16.9999f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(6.9999f)
                    close()
                    moveTo(22.0f, 16.9999f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(6.9999f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(16.9999f)
                    close()
                }
            }
        }
        .build()
        return _bandAid!!
    }

private var _bandAid: ImageVector? = null
